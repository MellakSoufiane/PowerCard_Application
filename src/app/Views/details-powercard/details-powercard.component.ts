import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Adress } from '../Model/Adress';
import { Billingaccount } from '../Model/BillingAccount';
import { Card } from '../Model/Card';
import { Client } from '../Model/Client';
import { Corporate } from '../Model/Corporate';
import { PowerCard } from '../Model/power-card';
import { Shadowaccount } from '../Model/ShadowAccount';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-details-powercard',
  templateUrl: './details-powercard.component.html',
  styleUrls: ['./details-powercard.component.css']
})
export class DetailsPowercardComponent implements OnInit {

  id: number;
  submitted = false;
  client: Client = new Client();
  shadowaccount: Shadowaccount=new Shadowaccount();
  billingaccount: Billingaccount = new Billingaccount();
  corporate: Corporate = new Corporate();
  card: Card = new Card('','','','',this.shadowaccount,this.billingaccount,this.corporate);
  adress: Adress = new Adress();
  powercard: PowerCard = new PowerCard('',this.client,this.card,this.adress);

  constructor(private route: ActivatedRoute,private router: Router,
    private service: HttpClientService) { }

  ngOnInit() {
    this.card = new Card('','','','',this.shadowaccount,this.billingaccount,this.corporate)
      
    this.powercard  = new PowerCard('',this.client,this.card,this.adress);


    this.id = this.route.snapshot.params['id'];
    
    this.service.getById(this.id)
      .subscribe(data => {
        console.log(data)
        this.powercard = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['/powercards']);
  }

}
