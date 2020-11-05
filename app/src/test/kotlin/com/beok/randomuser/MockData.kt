package com.beok.randomuser

object MockData {

    const val RANDOM_ONE_USER_JSON =
        """
        {
           "results":[
              {
                 "gender":"female",
                 "name":{
                    "title":"Mrs",
                    "first":"Kim",
                    "last":"Bradley"
                 },
                 "location":{
                    "street":{
                       "number":8409,
                       "name":"Mill Road"
                    },
                    "city":"Cambridge",
                    "state":"Cleveland",
                    "country":"United Kingdom",
                    "postcode":"D9X 1SN",
                    "coordinates":{
                       "latitude":"14.4031",
                       "longitude":"57.7706"
                    },
                    "timezone":{
                       "offset":"0:00",
                       "description":"Western Europe Time, London, Lisbon, Casablanca"
                    }
                 },
                 "email":"kim.bradley@example.com",
                 "login":{
                    "uuid":"9197d721-8670-4157-add3-c01d4829652f",
                    "username":"brownrabbit100",
                    "password":"starfire",
                    "salt":"xEbgwCO1",
                    "md5":"7b556c36ecf675978a691b2b0d4223a6",
                    "sha1":"0b8f294b77252f29491bf81c62c036230896e501",
                    "sha256":"c3b6d1f34553fe539e6fe4c2f46fc7e58006af88252cbb51ab4b0eb0605ce246"
                 },
                 "dob":{
                    "date":"1949-10-19T17:12:12.248Z",
                    "age":71
                 },
                 "registered":{
                    "date":"2016-10-11T20:21:14.933Z",
                    "age":4
                 },
                 "phone":"015396 26938",
                 "cell":"0725-517-946",
                 "id":{
                    "name":"NINO",
                    "value":"KE 47 46 34 N"
                 },
                 "picture":{
                    "large":"https://randomuser.me/api/portraits/women/30.jpg",
                    "medium":"https://randomuser.me/api/portraits/med/women/30.jpg",
                    "thumbnail":"https://randomuser.me/api/portraits/thumb/women/30.jpg"
                 },
                 "nat":"GB"
              }
           ],
           "info":{
              "seed":"a55a645d68a46915",
              "results":1,
              "page":1,
              "version":"1.3"
           }
        }
        """
}
