import { Adress } from "./Adress";
import { Card } from "./Card";
import { Client } from "./Client";


export class PowerCard  {
 
   
  id: number;
  type: string;
  client: Client;
  card: Card;
  adress: Adress;
   

  constructor(
    
    type: string, 
    client: Client, 
    card: Card,
    adress: Adress
    
) {
    
    this.type = type
    this.client = client
    this.card = card
    this.adress = adress
  }


}