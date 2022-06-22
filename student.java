

class student
{
    String name;
    double cgpa;
    int id;

    student(String name,int id,double cgpa)
    {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }

    @Override
    public String toString()
    {
        return "Name = "+name + " cgpa = "+cgpa +" id = "+id +" .";
    }
}

// sorting based on cgpa->name ->id