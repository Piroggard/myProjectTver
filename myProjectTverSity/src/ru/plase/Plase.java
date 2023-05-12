package ru.plase;

import java.util.List;

public class Plase {
   protected Type type;
   protected Address address;
   protected int rating;
   protected String name;
   protected List<Comment> comment;

   public Type getType() {
      return type;
   }

   public void setType(Type type) {
      this.type = type;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRating() {
      return rating;
   }

   public List<Comment> getComment() {
      return comment;
   }

   public void setComment(List<Comment> comment) {
      this.comment = comment;
   }

   public Plase(Type type, Address address, String name) {
      this.type = type;
      this.address = address;
      this.name = name;
      this.rating = getGeneralGrade();
   }

   public int getGeneralGrade (){
      if (getComment() == null){
         return 0;
      }  else {
         for (Comment comment1 : comment){
            rating = comment1.grade + rating;
         }
         return rating / comment.size();
      }
   }

   @Override
   public String toString() {
      return "Plase{" +
              "type=" + type +
              ", address=" + address +
              ", rating=" + rating +
              ", name='" + name + '\'' +
              ", comment=" + comment +
              '}';
   }
}
