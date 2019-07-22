package org.fasttrackit.SortingRecords;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingRecords {

    public static void main(String[] args) {
        Record record1 = new Record();
        record1.setFirstName( "Ana");
        record1.setLastName( "Pop");

        Record record2 = new Record();
        record1.setFirstName( "Bogdan");
        record2.setLastName( " Muresean ");



    List<Record> records = Arrays.asList(record1,record2);
    //    Comparator<String> lastNameComparator = Comparator.comparing(Record::getLastName); // fix me
  //  records.sort(lastNameComparator);

        System.out.println(records);


    }
}
