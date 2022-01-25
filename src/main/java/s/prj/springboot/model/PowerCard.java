package s.prj.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Data
@Document(collection="PowerCards")
public class PowerCard {
	@Transient
	public static final String SEQUENCE_NAME = "powercards_sequence"; 
	
	  @Id
	  private int id;

	 
    private String type;
    private Client client;
    private Card card;
    private Adress adress;
    
	

	

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

	

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public PowerCard(String type, Client client, Card card, Adress adress) {
		super();
		this.type = type;
		this.client = client;
		this.card = card;
		this.adress = adress;
	}
	
	@Override
    public String toString() {
        return "PowerCard [id=" + id + ", type=" + type + ", Client=" + client + ", Card=" + card + ", Adress=" +adress+
            "]";
    }
   	
}
