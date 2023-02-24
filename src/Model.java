public class Model {
    int num;       //번호
    int gas_amount = 100;    //주유량
    int change_speed;    //속도 변경
    int total_per;      //최대 승객 수
    int now_person;      //현재 탑승자 수
    boolean start;        //출발상태
    String status="정지 상태";       //상태

    public Model() {
    }


    public void race_start() {       //운행 시작
        if (gas_amount < 10) return;
        start = !start;
    }

    public void race_end() {       //운행 종료
        start = true;
    }

    public void check_oil() {       //기름 확인
    }

    public void change_speed(int speed) {      //속도 변경
        if (change_speed < speed) {
            this.change_speed = speed;
            System.out.println("속도를" + change_speed + "으로 올립니다");
        } else if (change_speed > speed) {
            this.change_speed = speed;
            System.out.println("속도를" + change_speed + "으로 감속합니다");
        }
    }


    public void change_status(String status){          //상태변경
        System.out.println("목적지를 " + this.status + "에서 " + status + " 상태로 변경합니다");
        this.status = status;
    }

    public void in_Car(int person) {                      //승객 탑승
        if(total_per > now_person+person){
            System.out.println("정원 초과입니다(" + ((now_person+person)-total_per) +"석 초과)");
//            return (now_person+person)-total_per;
        }else{
            now_person=person;
            System.out.println("현재 탑승자 수 : " + now_person);
            System.out.println("잔여 승객 수 : " + (total_per-now_person));
//            return now_person;
        }

    }
}