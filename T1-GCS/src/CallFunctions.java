import java.util.Date;

public class CallFunctions {

    public void mergeCall(Call call) {
        String caller = call.getCaller();

        int callId = call.getId();

        Date callDate = call.getCallDate();

        String equipment = call.getEquipment();

        this.setDescription(this.description + "\n Call ID#" + callId + "do usuario" + caller + " na data" + callDate
                + " para o equipamento" + equipment + "foi unida com essa.");

        call.setStatus(concluido);

        System.out.print(this.callId + ": Call unida com " + callId + " com sucesso. \n");
    }

    public void replicateCall() {
        if (this.status == "closed") {

            Call call = new Call(this.id + 1, this.emloyerId, this.productId, new Date(), this.description, "aberto");

        }
    }

}