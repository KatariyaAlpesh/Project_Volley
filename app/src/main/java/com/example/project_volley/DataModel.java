package com.example.project_volley;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel
{
    public DataModel(Integer id, String name, String username, String email, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public DataModel(String street, String suite, String city, String zipcode, String geo)
    {

    }

    public DataModel(String companyname, String catchPhrase, String bs)
    {

    }

    public static class Address
    {
        public Address(String street, String suite, String city, String zipcode, String geo) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
            this.geo = geo;
        }


        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private String geo;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getSuite() {
            return suite;
        }

        public void setSuite(String suite) {
            this.suite = suite;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getGeo() {
            return geo;
        }

        public void setGeo(String geo) {
            this.geo = geo;
        }

    }

    public static class Company
    {
        public Company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }


        private String name;
        private String catchPhrase;
        private String bs;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCatchPhrase() {
            return catchPhrase;
        }

        public void setCatchPhrase(String catchPhrase) {
            this.catchPhrase = catchPhrase;
        }

        public String getBs() {
            return bs;
        }

        public void setBs(String bs) {
            this.bs = bs;
        }

    }


        private Integer id;
        private String name;
        private String username;
        private String email;
        private Address address;
        private String phone;
        private String website;
        private Company company;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public Company getCompany() {
            return company;
        }

        public void setCompany(Company company) {
            this.company = company;
        }


    public class Geo
    {
        private String lat;
        private String lng;

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

    }

//
//    ///////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//    public class Addresss {
//
//        private String street;
//        private String suite;
//        private String city;
//        private String zipcode;
//        private Geo geo;
//
//        public Addresss(String street, String suite, String city, String zipcode, Geo geo) {
//            this.street = street;
//            this.suite = suite;
//            this.city = city;
//            this.zipcode = zipcode;
//            this.geo = geo;
//        }
//
//        public String getStreet() {
//            return street;
//        }
//
//        public void setStreet(String street) {
//            this.street = street;
//        }
//
//        public String getSuite() {
//            return suite;
//        }
//
//        public void setSuite(String suite) {
//            this.suite = suite;
//        }
//
//        public String getCity() {
//            return city;
//        }
//
//        public void setCity(String city) {
//            this.city = city;
//        }
//
//        public String getZipcode() {
//            return zipcode;
//        }
//
//        public void setZipcode(String zipcode) {
//            this.zipcode = zipcode;
//        }
//
//        public Geo getGeo() {
//            return geo;
//        }
//
//        public void setGeo(Geo geo) {
//            this.geo = geo;
//        }
//
//    }
//
//    public class Companyy
//    {
//
//        private String name;
//        private String catchPhrase;
//        private String bs;
//
//        public Companyy(String name, String catchPhrase, String bs) {
//            this.name = name;
//            this.catchPhrase = catchPhrase;
//            this.bs = bs;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getCatchPhrase() {
//            return catchPhrase;
//        }
//
//        public void setCatchPhrase(String catchPhrase) {
//            this.catchPhrase = catchPhrase;
//        }
//
//        public String getBs() {
//            return bs;
//        }
//
//        public void setBs(String bs) {
//            this.bs = bs;
//        }
//
//    }
//
//    public class DataModell {
//
//        private Integer id;
//        private String name;
//        private String username;
//        private String email;
//        private Address address;
//        private String phone;
//        private String website;
//        private Company company;
//
//        public DataModell(Integer id, String name, String username, String email, Address address, String phone, String website, Company company)
//        {
//            this.id = id;
//            this.name = name;
//            this.username = username;
//            this.email = email;
//            this.address = address;
//            this.phone = phone;
//            this.website = website;
//            this.company = company;
//        }
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getUsername() {
//            return username;
//        }
//
//        public void setUsername(String username) {
//            this.username = username;
//        }
//
//        public String getEmail() {
//            return email;
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        public Address getAddress() {
//            return address;
//        }
//
//        public void setAddress(Address address) {
//            this.address = address;
//        }
//
//        public String getPhone() {
//            return phone;
//        }
//
//        public void setPhone(String phone) {
//            this.phone = phone;
//        }
//
//        public String getWebsite() {
//            return website;
//        }
//
//        public void setWebsite(String website) {
//            this.website = website;
//        }
//
//        public Company getCompany() {
//            return company;
//        }
//
//        public void setCompany(Company company) {
//            this.company = company;
//        }
//
//    }
//
//    public class Geoo {
//
//        private String lat;
//        private String lng;
//
//        public Geoo(String lat, String lng)
//        {
//            this.lat = lat;
//            this.lng = lng;
//        }
//
//        public String getLat() {
//            return lat;
//        }
//
//        public void setLat(String lat) {
//            this.lat = lat;
//        }
//
//        public String getLng() {
//            return lng;
//        }
//
//        public void setLng(String lng) {
//            this.lng = lng;
//        }
//
//    }

}
