import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
import { PowerCard } from '../Model/power-card';

import { environment } from 'src/environments/environment';
import { throwError } from 'rxjs/internal/observable/throwError';
import { catchError, map, Observable } from 'rxjs';





@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
  private baseUrl = 'http://localhost:8080/powercards';  

  constructor(private http: HttpClient) { }
 
  getPowercards(): Observable<any> {  
    return this.http.get(`${this.baseUrl}`);
  }  

  getById(_id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${_id}`);
}

  addPowerCard(powercard: Object): Observable<Object>{
    return this.http.post(`${this.baseUrl}`+'/add',powercard)
  }

  updatePowerCard(id:number,powercard: PowerCard): Observable<Object>{
    return this.http.put(`${this.baseUrl}`+'/update',powercard);
  }

  deletePowerCard(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrl}/delete/${id}`, { responseType: 'text' });;
  }
}

