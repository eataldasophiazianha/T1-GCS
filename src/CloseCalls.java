public class CloseCalls {

    public void closeAllCalls() {
        for (Call call : calls) {
            if (call.getStatus() == "call.aberto" || call.getStatus() == "call.andamento") {
                call.setStatus("call.concluido");
            }
        }
    }
}
