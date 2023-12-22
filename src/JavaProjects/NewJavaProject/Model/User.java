package JavaProjects.NewJavaProject.Model;

public class User {
        private String id;
        private String name;
        private String address;
        private long phone;

        public User(String name, String id, String address, long phone) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

}
