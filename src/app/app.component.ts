import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PowerCard } from './Model/power-card';
import { HttpClientService } from './service/http-client.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'PowerCard Application';

  
}