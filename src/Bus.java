public class Bus extends Model{

    public Bus() {
        super();
        super.total_per=30;
        super.status="운행";
    }

    public void check_oil(Model m){
        if(gas_amount<10){
            System.out.println("주유가 필요합니다");
            super.status = "차고지행";
        }
    }

    @Override
    public void in_Car(int person) {                      //승객 탑승
        if(super.total_per < super.now_person+person){
            System.out.println("정원 초과입니다(" + ((super.now_person+person) - super.total_per) +"석 초과)");
//            return (super.now_person+person)-super.total_per;
        }else{
            now_person+=person;
            System.out.println("현재 탑승자 수 : " + now_person);
            System.out.println("잔여 승객 수 : " + (total_per-now_person));
        }

    }


    @Override
    public void change_speed(int speed) {      //속도 변경
        if(gas_amount<10){
            gas_amount=speed;
            System.out.println("주유가 필요합니다");
            super.status = "차고지행";
            race_end();
            System.out.println(super.start);
            return;
        }
        if (change_speed < speed) {
            this.change_speed = speed;
            System.out.println("속도를" + change_speed + "으로 올립니다");
        } else if (change_speed > speed) {
            this.change_speed = speed;
            System.out.println("속도를" + change_speed + "으로 감속합니다");
        }
    }
}

