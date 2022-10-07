import java.util.Objects;

public class Ush {
    private String emer;
    private String mbiemer;
    private int age;

    @Override
    public String toString() {
        return "Ush{" +
                "emer='" + emer + '\'' +
                ", mbiemer='" + mbiemer + '\'' +
                ", age=" + age +
                '}';
    }

    public Ush(String emer, String mbiemer, int age){
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.age = age;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Builder builder(){
      return new Builder();
    }


    static class Builder{
        private String emer="";
        private String mbiemer="";
        private int age=0;

        public Builder emer(String emer){
         this.emer = emer;
         return this;
        }
        public Builder mbiemer(String mbiemer){
            this.mbiemer = mbiemer;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Ush Build(){
            return new Ush(emer, mbiemer,age);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return age == builder.age && Objects.equals(emer, builder.emer) && Objects.equals(mbiemer, builder.mbiemer);
        }

        @Override
        public int hashCode() {
            return Objects.hash(emer, mbiemer, age);
        }
    }

}
