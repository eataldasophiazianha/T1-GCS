// package src;

// import java.util.Date;

// public class Call {
//     private int id;
//     private String employerId; 
//     private String productId; 
//     private Date callDate;
//     private String description;
//     private Status status;

//     public Call(int id, String employerId, String productId, Date callDate, String description, String status) {
//         this.id = id;
//         this.employerId = employerId;
//         this.productId = productId;
//         this.callDate = callDate;
//         this.description = description;
//         this.status = Status.valueOf(status);
//     }
//     public enum Status {
//     aberto,
//     andamento,
//     concluido,
//     }
//     public int getId() {
//         return id;
//     }
//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getCaller() {
//         return employerId;
//     }
//     public void setCaller(String employerId) {
//         this.employerId = employerId;
//     }
//     public String getEquipment() {
//         return productId;
//     }
//     public void setEquipment(String productId) {
//         this.productId = productId;
//     }

//     public Date getCallDate() {
//         return callDate;
//     }
//     public void setCallDate(Date callDate) {
//         this.callDate = callDate;
//     }

//     public String getDescription() {
//         return description;
//     }

//     public void setDescription(String description) {
//         this.description = description;
//     }

//     public Enum getStatus() {
//         return status;
//     }
//     public void setStatus(Enum status) {
//         if(this.status == Status.aberto && status == Status.concluido){
//             throw new IllegalArgumentException("Cannot close an open call");
//         }
//         if(this.status == Status.concluido && status == Status.aberto){
//             throw new IllegalArgumentException("Cannot open a closed call");
//         }
//         if(this.status == Status.concluido && status == Status.andamento){
//             throw new IllegalArgumentException("Cannot reopen a closed call");
//         }
//         this.status = (Status) status;
//     }
//     @Override
//     public String toString() {
//         return "Call{" +
//                 "id=" + id +
//                 ", employerId='" + employerId + '\'' +
//                 ", productId='" + productId + '\'' +
//                 ", callDate=" + callDate +
//                 ", description='" + description + '\'' +
//                 ", status=" + status +
//                 '}';
//     }
 
// }



