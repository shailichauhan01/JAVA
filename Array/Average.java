class Average{
    public static void main(String[] args){
        int []marks={85,90,45,67};
        int total=0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        double average=(double)total/marks.length;
        System.out.println(average);
    }
}