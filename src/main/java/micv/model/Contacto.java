package micv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Contacto {

	private ObjectProperty<Telefono> telefonos = new SimpleObjectProperty<>();
	private ObjectProperty<Email> emails = new SimpleObjectProperty<>();
	private ObjectProperty<Web> webs = new SimpleObjectProperty<>();
	
	public final ObjectProperty<Telefono> telefonosProperty() {
		return this.telefonos;
	}
	
	public final Telefono getTelefonos() {
		return this.telefonosProperty().get();
	}
	
	public final void setTelefonos(final Telefono telefonos) {
		this.telefonosProperty().set(telefonos);
	}
	
	public final ObjectProperty<Email> emailsProperty() {
		return this.emails;
	}
	
	public final Email getEmails() {
		return this.emailsProperty().get();
	}
	
	public final void setEmails(final Email emails) {
		this.emailsProperty().set(emails);
	}
	
	public final ObjectProperty<Web> websProperty() {
		return this.webs;
	}
	
	public final Web getWebs() {
		return this.websProperty().get();
	}
	
	public final void setWebs(final Web webs) {
		this.websProperty().set(webs);
	}
}
