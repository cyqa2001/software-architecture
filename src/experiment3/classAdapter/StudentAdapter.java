package experiment3.classAdapter;

import experiment3.pojo.Student;
import experiment3.target.StudentTarget;
import experiment3.util.SortUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends SortUtil implements StudentTarget {

    private List<Integer> intList = new ArrayList<>();
    private List<Student> students1 = new ArrayList<>();
    @Override
    public List sortStudent(List<Student> students) {
        if (intList != null) intList.clear();
        for (Student student : students) {
            intList.add(student.getId());
        }

        intList = sortInt(intList);


        if (students1 != null) students1.clear();

        for (Integer integer : intList) {
            for (Student student : students) {
                if (integer.equals(student.getId())) {
                    students1.add(student);
                    break;
                }
            }
        }
        students.clear();
        students.addAll(students1);



        return students;
    }
}
