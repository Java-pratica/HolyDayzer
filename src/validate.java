public class validate {
    private String message = "Não é um feriado";

    public void validateDate(String date, String[] holidays) {
        for(int i=0; i<holidays.length; i++){
            if(holidays[i].contains(date)){
                message = holidays[i];
            }
        }
        System.out.println(message);
    }
}
