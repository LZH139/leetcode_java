package BreadthFirstSearch;

import Common.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeImportance {
    public static void main(String[] argv) {
        EmployeeImportance d = new EmployeeImportance();
        d.out();
    }

    public void out() {
        Solution s = new Solution();
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.print(1);
    }

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        private int result;
        public int getImportance(List<Employee> employees, int id) {
            for(Employee e: employees){
                if(e.id==id){
                    result += e.importance;
                    if(e.subordinates.size()==0){
                        return result;
                    }
                    for(int i: e.subordinates){
                        getImportance(employees,i);
                    }
                }
            }
            return result;
        }
    }
}
    