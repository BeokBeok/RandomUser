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

    const val NULL_VALUE_CONTAINED_JSON =
        """
        {
            "results": [                
                {
                    "gender": "male",
                    "name": {
                        "title": "Mr",
                        "first": "Arnaud",
                        "last": "Knight"
                    },
                    "location": {
                        "street": {
                            "number": 3106,
                            "name": "15th St"
                        },
                        "city": "Carleton",
                        "state": "Newfoundland and Labrador",
                        "country": "Canada",
                        "postcode": "W0S 8W2",
                        "coordinates": {
                            "latitude": "-16.1372",
                            "longitude": "125.1821"
                        },
                        "timezone": {
                            "offset": "-5:00",
                            "description": "Eastern Time (US & Canada), Bogota, Lima"
                        }
                    },
                    "email": "arnaud.knight@example.com",
                    "login": {
                        "uuid": "8024243b-0222-4173-8015-e69f44fd5224",
                        "username": "blackfish672",
                        "password": "bell",
                        "salt": "AK0st91v",
                        "md5": "46fae267145bf9aed6d761367f8af06c",
                        "sha1": "28d80376cd1dff898a23b5dcf07ef27e76c9fdf4",
                        "sha256": "1093d246c541cffe86719eaa4398991fecee59a34e731fdee4b84bffc264d812"
                    },
                    "dob": {
                        "date": "1995-04-02T10:45:36.120Z",
                        "age": 25
                    },
                    "registered": {
                        "date": "2002-07-06T15:21:57.762Z",
                        "age": 18
                    },
                    "phone": "860-182-5332",
                    "cell": "515-468-4548",
                    "id": {
                        "name": "",
                        "value": null
                    },
                    "picture": {
                        "large": "https://randomuser.me/api/portraits/men/87.jpg",
                        "medium": "https://randomuser.me/api/portraits/med/men/87.jpg",
                        "thumbnail": "https://randomuser.me/api/portraits/thumb/men/87.jpg"
                    },
                    "nat": "CA"
                }
            ],
            "info": {
                "seed": "8b6849ed67a7959f",
                "results": 1,
                "page": 1,
                "version": "1.3"
            }
        }
        """
}
