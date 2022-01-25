import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
  
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PowercardComponent } from './powercard/powercard.component';
import { AddpowercardComponent } from './addpowercard/addpowercard.component';
import { DetailsPowercardComponent } from './details-powercard/details-powercard.component';

@NgModule({
  declarations: [
    AppComponent,
    PowercardComponent,
    AddpowercardComponent,
    DetailsPowercardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  
    ReactiveFormsModule,  
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
