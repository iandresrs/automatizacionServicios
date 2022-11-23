package io.petstore.swagger.steps;

import io.petstore.swagger.models.PetstoreModel;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class PetstoreStep {

    PetstoreModel petstoreModel = new PetstoreModel();

    //Peticion al servicio de crear usuario
    @Step
    public void crearUsuario() {
        SerenityRest.given().baseUri(petstoreModel.getUrl()).contentType(petstoreModel.getHeader()).body(petstoreModel.getUserBody()).post();
    }
    //Peticion al servicio de crear orden
    @Step
    public void crearOrden() {
        SerenityRest.given().baseUri(petstoreModel.getUrl()).contentType(petstoreModel.getHeader()).body(petstoreModel.getOrdenBody()).post();
    }

    public void creacionUsuarioyOrden(){
        crearUsuario();
        crearOrden();
    }

    //Peticion al servicio de validacion del status de usuario
    @Step
    public void validacionUsuario() {
        SerenityRest.lastResponse().then().statusCode(petstoreModel.getRESPONSECODE());
    }
    //Peticion al servicio de validacion del status de la orden
    @Step
    public void validacionOrden() {
        SerenityRest.lastResponse().then().statusCode(petstoreModel.getRESPONSECODE());
    }

    public void validaciones(){
        validacionUsuario();
        validacionOrden();
    }
}
