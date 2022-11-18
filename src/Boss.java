public class Boss extends GameEntity {
private int numberofarrows;

    public int getNumberofarrows() {
        return numberofarrows;
    }

    public void setNumberofarrows(int numberofarrows) {
        this.numberofarrows = numberofarrows;
    }

    private int machinegun;


        public int getMachineGun() {
            return machinegun;
        }

        public void setMachineGun(int machineGun) {
            this.machinegun = machineGun;
        }

    public String printInfo(){
            return  getDamage()  +": "+ getHealth() +": "+ getNumberofarrows() + ":" + getMachineGun();
        }
}





//создатьь #ДЗУрок2 Дэдлайн 19.11.2022 23 59
//ДЗ:
//Создать Enum WeaponType тип оружия и перечислить 3 типа.
//Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия. И добавить геттеры и сеттеры
//Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
//Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать всю информацию о боссе.
//ДЗ на сообразительность:
//Распечатывание информации сделать в методе в классе Босса public String printInfo(){}
//Создать класс Skeleton (Скелет), унаследовать от Босса.
//Добавить поле (кол-во стрел) и добавить геттеры и сеттеры в классе Skeleton.
//Переопределить родительский метод printInfo в классе Skeleton
//В Main распечатать информацию о Боссе с помощью метода printInfo, также создать 2 экземпляра