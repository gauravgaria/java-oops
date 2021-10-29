package collections;

import collections.interfaces.IArrayListTest;
import collections.model.ArrayListModel;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest implements IArrayListTest {

    private ArrayList<ArrayListModel> _userExpList = null;
    private String[] _userExpTags;
    private static ArrayListModel _userDataModel;
    public static void main(String[] args) {
        ArrayListTest test = new ArrayListTest();


        test.initializeData();
        test.takeUserInput();

        test.addItemToList(_userDataModel);
    }

    public void initializeData(){
        _userExpTags = new String[]{"football", "hurt", "pain", "playing"};
        _userExpList = new ArrayList<>();
    }

    public void takeUserInput(){

        if(_userExpList.isEmpty()){
            System.out.println("Add something about you..");
            userInputInterface();
        }else{
            System.out.println("Which operation do you want to perform.? add,delete,show" );
            Scanner userOps = new Scanner(System.in);
            String ops = userOps.nextLine();
            performOperation(ops);
        }

    }

    public void userInputInterface(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your experience");
        scan.nextLine();
        String exp = scan.nextLine();
        System.out.println("Enter 3 tags");
        String[] tags = new String[3];


        for(int i=0; i<3; i++){
            tags[i] = scan.nextLine();
        }

        _userDataModel  = new ArrayListModel(name,age, exp, tags);
        if(_userExpList.isEmpty()){
            _userExpList.add(_userDataModel);
        }
        takeUserInput();
    }

    public void performOperation(String ops){
        System.out.println();
        switch (ops){
            case "add":{
                userInputInterface();
                addItemToList(_userDataModel);
                break;
            }
            case "delete":{
                deleteItemFromList(0);
                break;
            }
            case "show":{
                ShowListItems(0);
            }
        }
    }

    @Override
    public void addItemToList(ArrayListModel model) {
        _userExpList.add(model);
    }

    @Override
    public void ShowListItems(int position) {
        _userExpList.get(position);

        System.out.println("Hello " + _userExpList.get(position).getName()
                        + ", your experiences "
                        + _userExpList.get(position).getExperience()
                        + " at the age of " + _userExpList.get(position).getAge()
                        + "\n tags-> ");
        for(String key:_userExpList.get(position).getKeywords())
        System.out.print(key + ", ");

    }

    @Override
    public void deleteItemFromList(int position) {
        _userExpList.remove(position);
    }

    @Override
    public void deleteAllItemsFromList(ArrayListModel model) {

    }
}

