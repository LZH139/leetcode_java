package Common.List;

public class List {
    public static ListNode createList(int[] list){
        ListNode head = new ListNode(list[0]);
        ListNode root = head;
        for(int i=1;i<list.length;i++){
            root.next = new ListNode(list[i]);
            root = root.next;
        }
        return head;
    }
    public static ListNode createList(int[] list, int pos){
        ListNode head = new ListNode(list[0]);
        ListNode root = head;
        ListNode posRoot = head;
        for(int i=1;i<list.length;i++){
            root.next = new ListNode(list[i]);
            root = root.next;
        }

        for(int i=0;i<list.length;i++){
            if(i!=pos){
                posRoot = posRoot.next;
            }else{
                root.next = posRoot;
            }
        }

        return head;
    }

    public static void main(String[] argv){
        int[] nums = new int[]{3,2,0,-4};
        int pos = 1;
        ListNode head = List.createList(nums,pos);
        System.out.println();
    }
}
