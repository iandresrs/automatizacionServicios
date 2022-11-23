package io.petstore.swagger.stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.petstore.swagger.steps.PetstoreStep;

public class PetstoreStepDefinition {

    PetstoreStep petstoreStep = new PetstoreStep();
    @Cuando("^se envien las peticiones al servicio$")
    public void seEnvienLasPeticionesAlServicio() {
        petstoreStep.creacionUsuarioyOrden();
    }
    @Entonces("^se valida el codigo de status sea (\\d+)$")
    public void seValidaElCodigoDeStatusSea(int arg1) {
        petstoreStep.validaciones();
    }
}
