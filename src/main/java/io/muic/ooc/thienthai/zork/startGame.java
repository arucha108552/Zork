package io.muic.ooc.thienthai.zork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*

    Help Einstein to find his friend Plunk and he will tell how to get
    antidote

    Help plunk from the prison get the key by defeat little boy

    # # # # # # # # # # #
    #C      #  M      I #
    #       #           #
    #       #           #
    # D D # #           #
    #               # Q #
    #     M         #   #
    # S             # C #
    # # # # # # # # # # #

    Darvin tell me to defeat all three monster to get the verification code to get id card and go in to the
    antidote radiation center

    # # # # # # # # # # #
    # I   # Q Q #   M   #
    # =                 #
    #         M         #
    # Q #               #
    #   #           M   #
    #   #               #
    # I # C   S         #
    # # # # # # # # # # #

    Issac seems to know which worm in this room keep the keycard to get antidote you
    you need to make sure you kill the right worm or else you will die

    french fries
    mc nugget
    double cheese burger
    big mac


    # # # # # # # # # # #
    # I         M     C #
    #      M            #
    #                 S #
    #    I              #
    # Q #       M       #
    #   # I           I #
    # # # # # # # # # # #




 */

class LikedQuest{

    private Character linkedChar;
    private int posX;
    private int posY;
    private java.lang.Character chngChar;

    public Character getLinkedChar() {
        return linkedChar;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public java.lang.Character getChngChar() {
        return chngChar;
    }

    public LikedQuest(Character link, int posx, int posy, java.lang.Character chng){
        linkedChar = link;
        posX = posx;
        posY = posy;
        chngChar = chng;
    }

}

class Monster{

    private Integer attk;
    private Integer posX;
    private Integer posY;
    private String Name;
    private Boolean DroppedItem;
    private Item itemInMonster;

    public Integer getAttk() {
        return attk;
    }

    public void setAttk(Integer attk) {
        this.attk = attk;
    }

    public Integer getPosX() {
        return posX;
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getDroppedItem() {
        return DroppedItem;
    }


    public Item getItemInMonster() {
        return itemInMonster;
    }

    public Monster(String nme, Integer attack, Integer posx, Integer posy, Boolean dropItem, Item item){
        Name = nme;
        attk = attack;
        posX = posx;
        posY = posy;
        DroppedItem = dropItem;
        itemInMonster = item;
    }

}

class QuestFactory{

    public QuestFactory(){

    }

    public void questStart (Character yourChar,Status yourStatus,posObject poOb){
        Scanner pause = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        String pauseRead;
        String read2;
        if(yourChar.getName().equals("Einstein")){
            if(yourChar.getQuestactive().equals(Boolean.FALSE)){
                System.out.println("Einstein: Who are you why are you here what do you want");
                System.out.println(" ");
                System.out.println("#### Please select your choice to answer a b ####");
                System.out.println("a. Please I need to find an antidote to cure me from radiation do you know where can I get it");
                System.out.println("b. You look so furious do you have any problem");
                System.out.println("Type in your number: ");
                read2 = read.nextLine();
                if(read2.equals("a")){
                    System.out.println("Einstein: I cannot help you now I have other thing to do get lost..!!");
                }else if(read2.equals("b")){
                    System.out.println("Einstein: My friend Plunk have been capture by the mutant");
                    System.out.println("#### Please select your choice to answer a b ####");
                    System.out.println("a. Ok calm down I can help you to get my friend back");
                    System.out.println("b. Sorry to hear that hope your friend will be safe");
                    //read = new Scanner(System.in);
                    read2 = read.nextLine();
                    if(read2.equals("a")){
                        System.out.println("Einstein: Really..!! great I heard that he was captured on the south east of my house");
                        System.out.println("Einstein: I need him back he is my best friend here is the only weapon that I have");
                        System.out.println("### Knife have been added in your inventory you can start using it by use the command 'equip' and type the name of your weapon ###");
                        yourStatus.addInverntory(new Item("Knife",null,null,17,"weapon","Normal knife use veru sharp easy to use"));
                        yourChar.setQuestactive(Boolean.TRUE);
                        yourStatus.setQueslist(yourChar.getName());
                    }else if(read2.equals("b")){
                        return;
                    }
                }else{
                    System.out.println(" ");
                    System.out.println("Einstein: I don't understand what you mean");
                    System.out.println("press enter...");
                    pauseRead = pause.nextLine();
                    return;
                }

            }else if(yourChar.getQuestactive().equals(Boolean.TRUE)){
                if(yourStatus.getIteminInventory("Plunk Massage")){
                    System.out.println("Einstein: Thank god my friend is already safe thank you very much");
                    System.out.println("Einstein: As an exchange I will tell you everything that you want to know");
                    System.out.println("#### Please select your choice to answer a b ####");
                    System.out.println("a. I want to know where can I get radiation cure can you tell me?");
                    System.out.println("b. Thats all right I just want to help you");
                    read2 = read.nextLine();
                    if(read2.equals("a")){
                        System.out.println("Umm...I think you have to go radiation center. I've heard before nuclear war. We try to develop an anti" +
                                " radiation. That the best place for you to try your luck. I cannot think of anything else");
                        System.out.println("It have a lot of mutant around that center so be careful GOOD LUCK...!!!");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("YOU HAVE COMPLETED LEVEL 1");
                        System.out.println("===============================================");
                        yourStatus.setLvc(2);
                        return;
                    }else{
                        System.out.println("Einstein: Ok see you later");
                        return;
                    }
                } else {
                    System.out.println("Einstein: Go find him what do you waiting for...!!!");
                    pause = new Scanner(System.in);
                    System.out.println("press enter...");
                    return;
                }
            }
        }else if(yourChar.getName().toLowerCase().equals("plunk")){
            if(yourStatus.getQueslist().containsKey("Einstein") && !yourChar.getQuestactive()){
                System.out.println("Plunk: Help me anybody here");
                System.out.println("### Please select your choice a b ###");
                System.out.println("a. Are you Plunk Einstein ask me to find you");
                System.out.println("b. Ignored him");
                read2 = read.nextLine();
                if(read2.equals("a")){
                    System.out.println("Plunk: Thank god..!! I thought im gonna die here");
                    System.out.println("Plunk: I got caught by mutant name Little boy when I try to fight him");
                    System.out.println("Plunk: Can you help me the key is with Little Boy you need to get it from him");
                    System.out.println("### Type in the number that you want to response a b ###");
                    System.out.println("a. Hang in there I will get the key for you");
                    System.out.println("b. That is your problem now I can't fight with him Im out");
                    read2 = read.nextLine();
                    if(read2.equals("a")){
                        System.out.println("Plunk: Great Im counting on you");
                        System.out.println("Plunk: By the way I put my weapon on the north side of your position" +
                                " it will help you to defeat Little Boy for sure and the Little boy is staying around near" +
                                " my weapon don't let him get it");
                        yourChar.setQuestactive(Boolean.TRUE);
                    }else{

                        System.out.println("T_T");
                        pauseRead = pause.nextLine();
                        return;

                    }
                }else{
                    return;
                }
            }else if(yourChar.getQuestactive() == Boolean.TRUE){
                for(Item item:yourStatus.getInventory()){
                    if(item.getName().equals("Cage Key")){
                        System.out.println("Plunk: Thank you very much I thought im gonna die here");
                        System.out.println("Plunk: Take this message to Einstein so he will know that i am safe now. See you later");
                        System.out.println("### 'Plunk Massage have been added to your inventory'");
                        yourChar.setQuesSucess(Boolean.TRUE);
                        yourStatus.addInverntory(new Item("Plunk Massage",null,null,0,"questitem", "Get this message to Einstein so he will know that Pluck is safe"));
                        return;
                    }
                }
                System.out.println("Plunk: Help me find the key from little boy. I put my weapon on the north side of your position" +
                        " it will help you to defeat Little Boy for sure and the Little boy is staying around near" +
                        " my weapon don't let him get it");
                return;
            }
        }

        if(yourChar.getName().equals("Darwin") && poOb.getX().equals(9) && poOb.getY().equals(5)){

            if(yourChar.getQuestactive() == false){
                System.out.println("Darwin: This place is surround by mutant run...!!");
                System.out.println("### Please select your answer choice a or b ###");
                System.out.println("a. Help help somebody help us");
                System.out.println("b. Hey..!! calm down I need to get in to the center is it have anyway to be in there");
                read2 = read.nextLine();
                if(read2.equals("b")){
                    System.out.println("Darwin: Im afraid that it would be impossible the mutant already control the center");
                    System.out.println("Darwin: The only way to get in the center by getting the key card from the lab and bring it to the center which locate on the north east side");
                    System.out.println("Darwin: You must get the clue from I think they keep all the password the pass word is 3 digit and it separate to each mutant");
                    System.out.println("Darwin: The monster located zero to six step to the north");
                    System.out.println("Darwin: I leave my weapon on the north west side. I gotta go now good luck");
                    yourChar.setQuestactive(true);
                }else{
                    return;
                }
            }else if(yourChar.getQuestactive() == true && poOb.getX().equals(9) && poOb.getY().equals(5)){
                System.out.println("Darwin: Just get out of here it is impossible to get in to the center");
                System.out.println("press enter...");
            }
        }else if(yourChar.getName().equals("Darwin") && poOb.getX().equals(7) && poOb.getY().equals(2)){

            if(yourChar.getQuestactive() == true ) {
                System.out.println("you: This seems to be the lab for key card I need to type in three digit password");
                System.out.println("### Please type 3 digit password ###");
                read2 = read.nextLine();
                if (read2.length() == 3) {
                    try {

                        if (Integer.parseInt(read2) == 573) {
                            System.out.println("### Your password is correct you can go into the room ###");
                            yourChar.setQuesSucess(true);
                        } else {
                            System.out.println("### Your password is wrong ###");
                        }

                    } catch (Exception e) {
                        System.out.println("### Your password is wrong ###");
                    }
                } else {
                    System.out.println("### Your password is wrong ###");
                }
            }else{
                System.out.println("This seems to be somekind of electric pad");
            }
        }else if(yourChar.getName().equals("Darwin") && poOb.getX().equals(1) && poOb.getY().equals(9)){
            if(yourStatus.getIteminInventory("Key Card") == true){
                System.out.println("### You can access to the radiation center");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("YOU HAVE COMPLETED LEVEL 2");
                System.out.println("===============================================");
                yourStatus.setLvc(3);
            }else{
                System.out.println("you: This is the radiation center I have to find a way to get in");
            }
        }else if(yourChar.getName().equals("Kroc")){
            if(yourChar.getQuestactive() == false){
                System.out.println("Kroc: So disgusting these mutant worm trying to get through antidote room");
                System.out.println(" ");
                System.out.println("### Please select your choice to answer a or b ###");
                System.out.println("a. I need to get a radiation cure could you help me please");
                System.out.println("b. Argh..!! I hate worm i am gonna throw up");
                read2 = read.nextLine();
                if(read2.equals("a")){
                    System.out.println("Kroc: I need that too but the thing is I don't know which worm is keep the key card");
                    System.out.println("Kroc: This worm is very sensitive it will explode when you trying to attack them");
                    System.out.println("Kroc: You need to find a right worm to kill and you will get the key card");
                    System.out.println("Kroc: After you get the key card you use that to open the door in the south west side");
                    yourChar.setQuestactive(true);
                }else {
                    System.out.println("Kroc: Go away don't throw up in front of me");
                }
            }else if(yourChar.getQuestactive() == true && poOb.getX().equals(9) && poOb.getY().equals(1)){
                System.out.println("Kroc: Can you get it or not or you just scared of worms");
            }else if(yourChar.getQuestactive() == true && poOb.getX().equals(7) && poOb.getY().equals(2)){
                if(yourStatus.getIteminInventory("radKeyCard")){
                    System.out.println("### Antidote Room is open get the cure in this room ###");
                    yourChar.setQuesSucess(true);
                }
            }else if(yourChar.getQuestactive() == false && poOb.getX().equals(7) && poOb.getY().equals(2)){
                System.out.println("you: its look like some kind of medicine room look like many cure is keep in here");
            }
        }
    }

}

class Item{

    private String Name;
    public Integer posX;
    public Integer posY;
    public Integer Attk;
    public String type;
    public String description;

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Item(String nme, Integer POSx, Integer POSy, Integer attk, String tpe, String descrip){
        Name = nme;
        posX = POSx;
        posY = POSy;
        Attk = attk;
        type = tpe;
        description = descrip;
    }

    public String getName(){
        return Name;
    }
}

class Status{

    private ArrayList<Item> Inventory = new ArrayList<Item>();
    private Integer Atk_Rate;
    private HashMap<String,Boolean> Queslist = new HashMap<String, Boolean>();
    private Item EquipedWeapon;
    private Integer lvc;
    private Boolean isGameover;

    public boolean getIteminInventory(String name){
        Item thisItem = null;
        for(Item myItem:Inventory){
            if(myItem.getName().toLowerCase().equals(name.toLowerCase())){
                thisItem = myItem;
                return true;
            }
        }
        if(thisItem == null){
            System.out.println("cant find this Item");
            return false;
        }
        return Boolean.parseBoolean(null);
    }

    public boolean getIteminInventory2(String name){
        Item thisItem = null;
        for(Item myItem:Inventory){
            if(myItem.getName().toLowerCase().equals(name.toLowerCase())){
                thisItem = myItem;
                return true;
            }
        }
        if(thisItem == null){
            return false;
        }
        return Boolean.parseBoolean(null);
    }

    public Item getEquipedWeapon() {
        return EquipedWeapon;
    }

    public void setLvc(Integer lvc) {
        this.lvc = lvc;
    }

    public Integer getLvc() {
        return lvc;
    }

    public Boolean getGameover() {
        return isGameover;
    }

    public void setGameover(Boolean gameover) {
        isGameover = gameover;
    }

    public Status(Integer level){
        EquipedWeapon = null;
        lvc = level;
        isGameover = false;
    }

    public void setEquipedWeapon(String equip){
        Item thisItem = null;
        Scanner pause = new Scanner(System.in);
        for(Item myItem:Inventory){
            if(myItem.getName().toLowerCase().equals(equip.toLowerCase())){
                thisItem = myItem;
            }
        }
        if(thisItem == null){
            System.out.println("cant find this weapon");
            return;
        }else if(thisItem.getType().equals("weapon")){
            EquipedWeapon = thisItem;
            System.out.println("You have equiped "+ equip);
        }
    }

    public void setQueslist(String name){
        Queslist.put(name,Boolean.TRUE);
    }

    public HashMap<String,Boolean> getQueslist(){
        return Queslist;
    }

    public Integer getAtk_Rate(){
        if(EquipedWeapon == null){
            return 10;
        }else{
            return EquipedWeapon.Attk;
        }
    }

    public void setAtk_Rate(Integer atk_rate){
        Atk_Rate = atk_rate;
    }

    public ArrayList<Item> getInventory(){
        return Inventory;
    }

    public void addInverntory(Item additem){
        System.out.println(additem.getName() + " have been added to your inventory");
        Inventory.add(additem);
    }

}

class Character{


    private boolean isQuesactive;
    private boolean isQuesSucess;
    private String Quote;
    private String Name;
    private Integer xPos;
    private Integer yPos;

    public boolean isQuesSucess() {
        return isQuesSucess;
    }

    public Character(String Nme, Integer positionX, Integer positionY){
        isQuesactive = Boolean.FALSE;
        isQuesSucess = Boolean.FALSE;
        xPos = positionX;
        yPos = positionY;
        Name = Nme;

    }

    public void setxPos(int x){
        xPos = x;
    }

    public void setyPos(int y){
        yPos = y;
    }

    public Integer getxPos(){
        return xPos;
    }

    public Integer getyPos(){
        return yPos;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Nme){
        Name = Nme;
    }

    public String getQuote(){
        return Quote;
    }

    public void setQuote(String set){
        Quote = set;
    }

    public void setQuestactive(Boolean set){
        isQuesactive = set;
    }

    public Boolean getQuestactive(){
        return isQuesactive;
    }

    public void setQuesactive(){

        isQuesactive = Boolean.TRUE;
    }

    public void setQuesSucess(Boolean set){
        isQuesSucess = set;
    }

}

class posObject{

    private Integer posX;
    private Integer posY;

    public posObject(int a,int b){
        posX = a;
        posY = b;
    }

    public Integer getX(){
        return posX;
    }

    public Integer getY(){
        return posY;
    }

    public void setX(Integer newX){
        posX = newX;
    }

    public void setY(Integer newY){
        posY = newY;
    }

}

class Map{

    private int levelCleared;
    private ArrayList<Character> listChar = new ArrayList<Character>();
    private ArrayList<Item> listItem = new ArrayList<Item>();
    private ArrayList<Monster> listMonster = new ArrayList<Monster>();
    private ArrayList<LikedQuest> listLinkedQuest = new ArrayList<LikedQuest>();
    private Status player;
    private String[] map;
    private boolean insideStatus;

    public Map(int lvc,Status your){

        levelCleared = lvc;
        player = your;
        insideStatus = Boolean.FALSE;

        if(levelCleared == 1){
            String[] set = {
                    "=====######",
                    "=C  =    I#",
                    "=   =     #",
                    "=   =  M  #",
                    "#=DD=     #",
                    "#         #",
                    "#         #",
                    "#   M   =Q=",
                    "#       = =",
                    "#S      =C=",
                    "###########"
            };
            setMap(set);
            Character Einstein = new Character("Einstein",1,1);
            Character Plunk = new Character(    "Plunk",9,9);
            Einstein.setQuestactive(Boolean.FALSE);
            Plunk.setQuestactive(Boolean.FALSE);
            listChar.add(Einstein);
            listChar.add(Plunk);
            Item Handgun = new Item("Handgun",1,9,25,"weapon", "Normal gun high attack use for combat");
            listItem.add(Handgun);
            Monster Fatman = new Monster("Fatman",15,7,4,false,null);
            Monster littleBoy = new Monster("Little Boy",19,3,7,true,new Item("Cage Key",null,null,0,"questitem","Use this key to unlock the cage to free Plunk"));
            listMonster.add(Fatman);
            listMonster.add(littleBoy);
            LikedQuest PlunkHLP = new LikedQuest(Plunk,7,9,null);
            listLinkedQuest.add(PlunkHLP);


        }else if(levelCleared == 2){
            String[] set = {
              "###########",
              "#I       Q#",
              "#===      #",
              "#     M   #",
              "#         #",
              "#  M      #",
              "#       M #",
              "==Q=      #",
              "=  =      #",
              "= I= C S  #",
              "====#######"
            };
            setMap(set);
            //public Monster(String nme, Integer attack, Integer posx, Integer posy, Boolean dropItem, Item item)
            //Item(String nme, Integer POSx, Integer POSy, Integer attk, String tpe, String descrip)
            Character darwin = new Character("Darwin",9,5);
            LikedQuest keyCardDoor = new LikedQuest(darwin,7,2,'D');
            LikedQuest Center = new LikedQuest(darwin,1,9,null);
            Monster Erectus = new Monster("Erectus",20,5,3,true,new Item("Passcode1",null,null,0,"questitem","A paper which contain number 3 in it"));
            Monster Naenderthal = new Monster("Naenderthal",25,3,6,true,new Item("Passcode2",null,null,0,"questitem", "A paper which contain number 5 in it"));
            Monster Sapiens = new Monster("Sapiens",30,6,8,true,new Item("Passcode3",null,null,0,"questitem","A paper which contain number 7 in it"));
            Item Chainsaw = new Item("Chainsaw",1,1,35,"weapon","Big chainsaw high attackrate destroy everything");
            Item keyCard = new Item("Key Card",9,2,0,"questitem","key card use to open the radiation center");
            listLinkedQuest.add(keyCardDoor);
            listLinkedQuest.add(Center);
            listChar.add(darwin);
            listMonster.add(Erectus);
            listMonster.add(Naenderthal);
            listMonster.add(Sapiens);
            listItem.add(Chainsaw);
            listItem.add(keyCard);
        }else if(levelCleared == 3){
            String[] set = {
                    "###########",
                    "#I    M  C#",
                    "#         #",
                    "#    M   S#",
                    "#         #",
                    "#         #",
                    "#      M  #",
                    "==Q=I     #",
                    "=  =      #",
                    "= I=     I#",
                    "====#######"
            };
            setMap(set);
            Character kroc = new Character("Kroc",1,9);
            listChar.add(kroc);
            Monster mcdonald = new Monster("mcdonald",1,6,7,true,new Item("radKeyCard",null,null,0,"questitem","The key card that use to open antidote room"));
            listMonster.add(mcdonald);
            listMonster.add(new Monster("mccarthy",1,1,6,false,null));
            listMonster.add(new Monster("mcintyre",1,3,5,false,null));
            listItem.add(new Item("paper1",1,1,0,"questitem","A paper which have a word 'french fries'"));
            listItem.add(new Item("paper2",7,4,0,"questitem","A paper which have a word 'cheese burger'"));
            listItem.add(new Item("paper3",9,9,0,"questitem","A paper which have a word 'Big Mac'"));
            listLinkedQuest.add(new LikedQuest(kroc,7,2,'D'));
            listItem.add(new Item("antidote",9,2,0,"questitem","A antidote"));
        }

    }

    public void setMap(String[] set){
        map = set;
    }

    public posObject getStartingPoint(){
        int count = 0;
        for(String i : map){
            for(int j = 0;j<i.length();j++){
                if(i.charAt(j) == 'S'){
                    return new posObject(count,j);
                }
            }
            count +=1;
        }
        return null;
    }

    public LikedQuest getLinkedQuestbyPos(Integer posX,Integer posY){
        for(LikedQuest linkedQuest:listLinkedQuest){
            if(linkedQuest.getPosX().equals(posX) && linkedQuest.getPosY().equals(posY)){
                return linkedQuest;
            }
        }
        return null;
    }

    public Monster getMonbyPos(Integer posX,Integer posY){
        for(Monster monster:listMonster){
            if(monster.getPosX().equals(posX) && monster.getPosY().equals(posY)){
                return monster;
            }
        }
        return null;
    }

    public Character getCharbyPos(Integer posX,Integer posY){
        for(Character chr:listChar){
            //System.out.println(posX+" "+posY);
            if(chr.getxPos().equals(posX) && chr.getyPos().equals(posY)){
                return chr;
            }
        }
        return null;
    }

    public Item getItembyPos(Integer posX,Integer posY){
        for(Item item:listItem){
            if(item.posX.equals(posX) && item.posY.equals(posY)){
                return item;
            }
        }
        return null;
    }

    public String[] getMap(){

        return map;
    }

    public void deleteChar(Integer xPos,Integer yPos){
        StringBuilder newOne = new StringBuilder(map[xPos]);
        newOne.setCharAt(yPos,' ');
        map[xPos] = newOne.toString();
    }


    public posObject verifyToken(Map map,posObject posOb,String token,Status youStat) throws IOException{
        if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == '#'){
            System.out.println("I found the big giant wall I cannot pass");
            System.out.println("========================================");
            return chngToken(posOb,token);
        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == ' '){
            System.out.println("####  Sucessfully walk " + token + " ####");
            System.out.println("========================================");
            return posOb;
        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == '='){
            if(insideStatus == Boolean.FALSE) {
                System.out.println("you: I found some kind of wall I cannot pass but it look like a place to live it would have door somewhere here");
                System.out.println("========================================");
            }else{
                System.out.println("you: I found a wall I cant get through");
                System.out.println("========================================");
            }
            return chngToken(posOb,token);
        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == 'D'){
            if(insideStatus == Boolean.FALSE){
                System.out.println("Found a door do you want to get in (yes/no) :");
            }else{
                System.out.println("Found a door do you want to get out (yes/no) :");
            }
            Scanner read = new Scanner(System.in);
            if(insideStatus == Boolean.FALSE){
                insideStatus = Boolean.TRUE;
            }else if(insideStatus == Boolean.TRUE){
                insideStatus = Boolean.FALSE;
            }
            if(read.nextLine().toLowerCase().equals("yes")){
                if(insideStatus == Boolean.FALSE){
                    System.out.println("you: Im going out");
                }else{
                    System.out.println("you: Im come in");
                }
                System.out.println("========================================");
                if(token.toLowerCase().equals("up")){
                    posOb.setX(posOb.getX()-1);
                    return posOb;
                }else if(token.toLowerCase().equals("down")){
                    posOb.setX(posOb.getX()+1);
                    return posOb;
                }else if(token.toLowerCase().equals("left")){
                    posOb.setY(posOb.getY()-1);
                    return posOb;
                }else if(token.toLowerCase().equals("right")){
                    posOb.setY(posOb.getY()+1);
                    return posOb;
                }
            }else if(read.nextLine().toLowerCase().equals("no")){
                System.out.println("Im not going to this door");
                System.out.println(" ");
                System.out.println("========================================");
                System.out.println(" ");
                return chngToken(posOb,token);
            }else {
                System.out.println("Im not understand what I should do");
                System.out.println(" ");
                System.out.println("========================================");
                System.out.println(" ");
                return chngToken(posOb, token);
            }
        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == 'C'){
            Character myChar = getCharbyPos(posOb.getX(),posOb.getY());
            QuestFactory getQuest = new QuestFactory();
            getQuest.questStart(myChar,youStat,posOb);
            return chngToken(posOb,token);
        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == 'I'){
            System.out.println("you: This " + getItembyPos(posOb.getX(),posOb.getY()).getName() + " might be useful");
            System.out.println(" ");
            System.out.println("#### Get it or not (yes/no) ####");
            System.out.println(" ");
            Scanner read = new Scanner(System.in);
            if(read.nextLine().toLowerCase().equals("yes")){
                player.addInverntory(getItembyPos(posOb.getX(),posOb.getY()));
                deleteChar(posOb.getX(),posOb.getY());
                if(player.getIteminInventory2("antidote") == true){
                    player.setLvc(4);
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("### Contgratulation you already clear this game ###");
                    System.out.println("===================================================");
                }
                return chngToken(posOb,token);
            }else{
                System.out.println("I don't want to get this item");
                System.out.println("");
                return chngToken(posOb,token);
            }


        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == 'M'){

            Monster monster = getMonbyPos(posOb.getX(),posOb.getY());
            System.out.println("##### You found a Monster #####");
            System.out.println("");
            System.out.println("Name: "+monster.getName() + "| Attack Rate: "+ monster.getAttk());
            System.out.println(" ");
            System.out.println("##### Do you want to fight with it (yes/no)");
            Scanner read = new Scanner(System.in);
            if(read.nextLine().toLowerCase().equals("yes")){
                System.out.println("you: come on I will crush you");
                if(monster.getName().equals("mcintyre") || monster.getName().equals("mccarthy")){
                    System.out.println("Worm explode");
                    System.out.println("You got killed by "+ monster.getName());
                    System.out.println("#### GAME OVER ####");
                    player.setGameover(true);
                    System.out.println();
                    return null;
                }
                if(player.getAtk_Rate() > monster.getAttk()){
                    System.out.println("You have killed " + monster.getName());
                    deleteChar(posOb.getX(),posOb.getY());
                    if(monster.getDroppedItem()){
                        player.addInverntory(monster.getItemInMonster());
                    }
                    return chngToken(posOb,token);
                }else if(player.getAtk_Rate() < monster.getAttk()){
                    System.out.println("You got killed by "+ monster.getName());
                    System.out.println("#### GAME OVER ####");
                    player.setGameover(true);
                }else if(player.getAtk_Rate() == monster.getAttk()){
                    System.out.println("You and the monster cannot do anything to each other because the attacking rate are equal");
                    return chngToken(posOb,token);
                }
            }else if(read.nextLine().toLowerCase().equals("no")){
                System.out.println("you: I think I will not fight with it at this time");
                return chngToken(posOb,token);
            }else{
                System.out.println("you: I am not understand what I should do");
                return chngToken(posOb,token);
            }

        }else if(map.getMap()[posOb.getX()].charAt(posOb.getY()) == 'Q'){
            LikedQuest myChar = getLinkedQuestbyPos(posOb.getX(),posOb.getY());
            QuestFactory getQuest = new QuestFactory();
            getQuest.questStart(myChar.getLinkedChar(),youStat,posOb);
            if(posOb.getX().equals(7) && posOb.getY().equals(2) && myChar.getLinkedChar().isQuesSucess() == true && myChar.getLinkedChar().getName().equals("Darwin")) {
                StringBuilder newOne = new StringBuilder(getMap()[posOb.getX()]);
                newOne.setCharAt(posOb.getY(), 'D');
                getMap()[posOb.getX()] = newOne.toString();
            }else if(posOb.getX().equals(7) && posOb.getY().equals(2) && myChar.getLinkedChar().isQuesSucess() == true && myChar.getLinkedChar().getName().equals("Kroc")){
                StringBuilder newOne = new StringBuilder(getMap()[posOb.getX()]);
                newOne.setCharAt(posOb.getY(), 'D');
                getMap()[posOb.getX()] = newOne.toString();
            }
            return chngToken(posOb,token);
        }

        return null;
    }

    public posObject chngToken(posObject posOb,String token){
            if(token.toLowerCase().equals("up")){
                posOb.setX(posOb.getX()+1);
                return posOb;
            }else if(token.toLowerCase().equals("down")){
                posOb.setX(posOb.getX()-1);
                return posOb;
            }else if(token.toLowerCase().equals("left")){
                posOb.setY(posOb.getY()+1);
                return posOb;
            }else if(token.toLowerCase().equals("right")){
                posOb.setY(posOb.getY()-1);
                return posOb;
            }

            return null;
    }


}

public class startGame {

    public static void main(String[] args) throws IOException {
//        ####TEST FOR LVL1
        Integer level = 1;
        System.out.println("#### After the nuclear out break all of the people have died you have been crush by the bombing radiation ####");
        System.out.println("#### Luckily you still survive but still have radiation in your body you must find a way to get cured before you will be mutation ####");
        System.out.println("You: Oh how long did I passed out I have to find a way to get rid of my radiation");
        System.out.println("You: On the north is still have a living place and may be I can find someone to help me over there");
        Status myStatus = new Status(level);
        Map map = new Map(level,myStatus);
        posObject posOb = map.getStartingPoint();
        runLvl(posOb,map,myStatus,level);

        // TEST FOR LVL2
        level = 2;
        System.out.println("### After you know that the cure is in the radiation center you reach on the entrance ###");
        System.out.println("you: I have to find a way to get in there on my west side have someone there I should ask him");
        map = new Map(level,myStatus);
        posOb = map.getStartingPoint();
        runLvl(posOb,map,myStatus,level);

//        // TEST FOR LVL3
        level = 3;
        System.out.println("you: finally im can access to radition center oh someone on the north side may be he can help me");
        map = new Map(level,myStatus);
        posOb = map.getStartingPoint();
        runLvl(posOb,map,myStatus,level);

    }

    public static void runLvl(posObject posOb,Map map,Status myStatus,Integer lvc) throws IOException {
        Scanner reader = new Scanner(System.in);
        String command;

        while (Boolean.TRUE && myStatus.getLvc() == lvc && myStatus.getGameover() == false) {
            System.out.println("Enter the command: ");
            command = reader.nextLine();
            if (command.toLowerCase().equals("up")) {
                System.out.println("you: I want to go up");
                posOb.setX(posOb.getX() - 1);
                map.verifyToken(map, posOb, command,myStatus);
            } else if (command.toLowerCase().equals("down")) {
                System.out.println("you: I want to go down");
                System.out.println(" ");
                posOb.setX(posOb.getX() + 1);
                map.verifyToken(map, posOb, command,myStatus);
            } else if (command.toLowerCase().equals("left")) {
                System.out.println("you: I want to go left");
                System.out.println(" ");
                posOb.setY(posOb.getY() - 1);
                map.verifyToken(map, posOb, command,myStatus);
            } else if (command.toLowerCase().equals("right")) {
                System.out.println("you: I want to go right");
                System.out.println(" ");
                posOb.setY(posOb.getY() + 1);
                map.verifyToken(map, posOb, command,myStatus);
            } else if (command.toLowerCase().equals("help")) {
                System.out.println("help");
                System.out.println(" ");
            } else if (command.toLowerCase().equals("exit")) {
                System.out.println("exit");
                System.out.println(" ");
                break;
            } else if (command.toLowerCase().equals("status")) {
                System.out.println("Your Attack Rate is: " + myStatus.getAtk_Rate());
                System.out.println(" ");
                System.out.println("###### This is your inventory ######");
                System.out.println(" ");
                if (myStatus.getInventory().isEmpty()) {
                    System.out.println("You not have anything in your inventory");
                    System.out.println(" ");
                }
                for (Item inven : myStatus.getInventory()) {
                    System.out.println("Weapon name: "+inven.getName() + "| Attack Rate: " + inven.Attk + " | Item type: " + inven.type + " | Description: " + inven.getDescription());
                }
                System.out.println("===================================");
                System.out.println(" ");
                System.out.println("###### This is your Ques list ######");
                System.out.println(" ");
                System.out.println(myStatus.getQueslist());
                System.out.println(" ");
                System.out.println("===================================");
                System.out.println("##### Your equiped weapon #####");
                if(myStatus.getEquipedWeapon() == null){
                    System.out.println("I don't have any equiped weapon");
                }else{
                    System.out.println(myStatus.getEquipedWeapon().getName());
                }
            }else if(command.toLowerCase().equals("equip")){
                System.out.println("What weapon you want to equip");
                command = reader.nextLine();
                myStatus.setEquipedWeapon(command);
            }else{
                System.out.println("you: I am not understand what I should do");
            }
        }
    }
}
