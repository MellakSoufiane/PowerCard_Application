import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PowercardComponent } from './powercard/powercard.component';
import { AddpowercardComponent } from './addpowercard/addpowercard.component';
import { DetailsPowercardComponent } from './details-powercard/details-powercard.component';
const routes: Routes = [
  {path: 'powercards', component: PowercardComponent},
  {path: 'Addpowercard', component: AddpowercardComponent},
  {path: 'powercards/:id', component: DetailsPowercardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
