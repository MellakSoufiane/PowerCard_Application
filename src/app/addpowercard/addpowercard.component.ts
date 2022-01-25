import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Adress } from '../Model/Adress';
import { Billingaccount } from '../Model/BillingAccount';
import { Card} from '../Model/Card';
import { Client } from '../Model/Client';
import { Corporate } from '../Model/Corporate';
import { PowerCard } from '../Model/power-card';
import { Shadowaccount } from '../Model/ShadowAccount';
import { AlertServiceService } from '../service/alert-service.service';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-addpowercard',
  templateUrl: './addpowercard.component.html',
  styleUrls: ['./addpowercard.component.css']
})
export class AddpowercardComponent  {
  model: any = {};
  submitted = false;
  client: Client = new Client();
  shadowaccount: Shadowaccount=new Shadowaccount();
  billingaccount: Billingaccount = new Billingaccount();
  corporate: Corporate = new Corporate();
  card: Card = new Card('','','','',this.shadowaccount,this.billingaccount,this.corporate);
  adress: Adress = new Adress();
  powercard: PowerCard = new PowerCard('',this.client,this.card,this.adress);
  constructor(
      private router: Router,
      private service: HttpClientService,) { }

      ngOnInit() {
    }
  
    newPowercard(): void {
      this.submitted = false;
      this.card = new Card('','','','',this.shadowaccount,this.billingaccount,this.corporate)
      
      this.powercard  = new PowerCard('',this.client,this.card,this.adress);
    }
  
    save() {
      this.service.addPowerCard(this.powercard)
        .subscribe(data => console.log(data), error => console.log(error));
        this.card = new Card('','','','',this.shadowaccount,this.billingaccount,this.corporate)
        this.powercard  = new PowerCard('',this.client,this.card,this.adress);
        this.router.navigate(['/powercards']);
    }
  
    onSubmit() {
      this.submitted = true;
      this.save();    
    }
  
  
  }