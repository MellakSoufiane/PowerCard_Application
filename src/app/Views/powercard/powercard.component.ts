import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { NgxSpinnerService } from 'ngx-spinner';
import { Observable, Subject } from 'rxjs';
import { environment } from 'src/environments/environment';
import { PowerCard } from '../Model/power-card';
import { HttpClientService } from '../service/http-client.service';


@Component({
  selector: 'app-powercard',
  templateUrl: './powercard.component.html',
  styleUrls: ['./powercard.component.css']
})
export class PowercardComponent implements OnInit {

    
    powercards: Observable<PowerCard[]>;
  

    constructor(private service:HttpClientService, private router: Router) { }  
  
     
   
  
    ngOnInit(): void {
      this.reloadData();
    }
  
    reloadData() {
      this.powercards = this.service.getPowercards();
    }
    
    powercardDetails(id: number){
      this.router.navigate(['/powercards/', id]);
    }
    
    deletePowerCard(id: number) {
      this.service.deletePowerCard(id)
        .subscribe(
          data => {
            console.log(data);
            this.reloadData();
          },
          error => console.log(error));
    }
  
  
  }