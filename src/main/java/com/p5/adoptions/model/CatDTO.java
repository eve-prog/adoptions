package com.p5.adoptions.model;
//dto = data transfer object -> transfera date dintr-o parte in cealalta
public class CatDTO extends AnimalDTO
{
    public CatDTO(String name, String photoUrl, Integer id)
    {
        super(name, photoUrl, id);
    }

    public void iAmACat()
    {
        System.out.println("Cats are special!");
    }

    @Override
    public void speak()
    {
        System.out.println("Cat speaks!");
    }
}