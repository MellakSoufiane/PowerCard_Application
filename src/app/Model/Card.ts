import { Billingaccount } from "./BillingAccount";
import { Corporate } from "./Corporate";
import { Shadowaccount } from "./ShadowAccount";

export class Card {
    id: number;
    bank:String;
    branch:String;
    card_product_code:String;
    basic_card:String;
    shadowaccount: Shadowaccount;
    billingaccount: Billingaccount;
    corporate: Corporate;


  constructor(
    
    bank: String, 
    branch: String, 
    card_product_code: String, 
    basic_card:String,
    shadowaccount: Shadowaccount, 
    billingaccount: Billingaccount, 
    corporate: Corporate
) {
   
    this.bank = bank
    this.branch = branch
    this.card_product_code = card_product_code
    this.basic_card = basic_card
    this.shadowaccount = shadowaccount
    this.billingaccount = billingaccount
    this.corporate = corporate
  }
 
  


}

