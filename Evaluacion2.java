
class Evaluacion2{
    public static void main(String args[]){
        Students students=new Students("Algebra", "Claudio Castro Murllo");
        Teachers teachers=new Teachers("Algebra", "Felix Jimenez Perez");
        System.out.println("materias: "+students.getMatters());
        System.out.println("materia: "+teachers.getMatters());
    }
}

class Faculty{
    private Students students;
    private Teachers teachers;
    private int semester;
    private String matters;

    public Faculty(Studens students,Teachers teachers,int semester,String matters){
        this.students=students;
        this.teachers=teachers;
        this.semester=semester;
        this.matters=matters;
    }

    public Studens getStudents(){
        return students;
    }
    public void setStudents(Students students){
        this.students=students;
    }
    public Teachers getTeachers(){
        return teachers;
    }
    public void setTeachers(Teachers teachers){
        this.teachers=teachers;
    }
    public int getSemester(){
        return semester;
    }
    public void setSemester(int semester){
        this.semester=semester;
    }
    public String getMatters(){
        return matters;
    }
    public void setMatters(String matters){
        this.matters=matters;
    }

}

static class Students extends Faculty{
    super.Faculty(matters);
    private String name;
    
    public Students(String matters,String name){
        this.matters=matters;
        this.name=name;
    }

    public String getMatters(){
        return matters;
    }
    public void setMatters(String matters){
        this.matters=matters;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}

class Teachers{
    //super.Faculty(matters);
    private String name;
    private String matters;
    public Teachers(String matters,String name){
        this.matters=matters;
        this.name=name;
    }

    public String getMatters(){
        return matters;
    }
    public void setMatters(String matters){
        this.matters=matters;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

}
