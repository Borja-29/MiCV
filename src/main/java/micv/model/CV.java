package micv.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class CV {

	private ObjectProperty<Personal> personal = new SimpleObjectProperty<>();
	private ObjectProperty<Titulo> formacion = new SimpleObjectProperty<>();
	private ObjectProperty<Conocimiento> habilidades = new SimpleObjectProperty<>();
	private ObjectProperty<Experiencia> experiencias = new SimpleObjectProperty<>();
	private ObjectProperty<Contacto> contacto = new SimpleObjectProperty<>();

	public final ObjectProperty<Personal> personalProperty() {
		return this.personal;
	}

	public final Personal getPersonal() {
		return this.personalProperty().get();
	}

	public final void setPersonal(final Personal personal) {
		this.personalProperty().set(personal);
	}

	public ObjectProperty<Titulo> getFormacion() {
		return formacion;
	}

	public void setFormacion(ObjectProperty<Titulo> formacion) {
		this.formacion = formacion;
	}

	public ObjectProperty<Conocimiento> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ObjectProperty<Conocimiento> habilidades) {
		this.habilidades = habilidades;
	}

	public ObjectProperty<Experiencia> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(ObjectProperty<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	public ObjectProperty<Contacto> getContacto() {
		return contacto;
	}

	public void setContacto(ObjectProperty<Contacto> contacto) {
		this.contacto = contacto;
	}
}
