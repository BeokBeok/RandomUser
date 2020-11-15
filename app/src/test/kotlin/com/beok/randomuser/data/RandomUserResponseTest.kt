package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomUserResponseTest {

    @Test
    fun `한 사람의 정보에 대한 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<RandomUserResponse>(RANDOM_ONE_USER_JSON)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }

    @Test
    fun `필드값에 null 이 있는 경우 기본값으로 초기화합니다`() {
        val response = Json {
            coerceInputValues = true
        }.decodeFromString<RandomUserResponse>(NULL_VALUE_CONTAINED_JSON)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }

    @Test
    fun `멀티 타입을 제공하는 변수 (postcode 필드) 는 무시합니다`() {
        val response = Json {
            ignoreUnknownKeys = true
        }.decodeFromString<RandomUserResponse>(MIXED_TYPE_JSON)

        assertThat(response.results.size).isEqualTo(2)
        assertThat(response.info.results).isEqualTo(2)
    }

    companion object {
        private const val RANDOM_ONE_USER_JSON = """
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

        private const val NULL_VALUE_CONTAINED_JSON = """
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

        private const val MIXED_TYPE_JSON = """
        {
            "results": [
                {
                    "gender": "female",
                    "name": {
                        "title": "Ms",
                        "first": "فاطمه",
                        "last": "علیزاده"
                    },
                    "location": {
                        "street": {
                            "number": 623,
                            "name": "شهید محمد منتظری"
                        },
                        "city": "ایلام",
                        "state": "همدان",
                        "country": "Iran",
                        "postcode": 35311,
                        "coordinates": {
                            "latitude": "30.2122",
                            "longitude": "75.8493"
                        },
                        "timezone": {
                            "offset": "+11:00",
                            "description": "Magadan, Solomon Islands, New Caledonia"
                        }
                    },
                    "email": "ftmh.aalyzdh@example.com",
                    "login": {
                        "uuid": "97ff072b-4de0-4b6f-9241-031ee26e2b74",
                        "username": "beautifulbird304",
                        "password": "dabears",
                        "salt": "25cTz0Kl",
                        "md5": "4ebfa841274a6724f7712f087cd55a83",
                        "sha1": "0cdf5e592817d377c63048ae1174d9588b7a4af1",
                        "sha256": "c074ef6d00d5d40478dacc6d31a0e1c3df06e8d64624077e6320f1f750a8c316"
                    },
                    "dob": {
                        "date": "1950-12-13T11:39:29.950Z",
                        "age": 70
                    },
                    "registered": {
                        "date": "2017-10-05T06:26:13.598Z",
                        "age": 3
                    },
                    "phone": "013-91742485",
                    "cell": "0901-212-2701",
                    "id": {
                        "name": "",
                        "value": ""
                    },
                    "picture": {
                        "large": "https://randomuser.me/api/portraits/women/90.jpg",
                        "medium": "https://randomuser.me/api/portraits/med/women/90.jpg",
                        "thumbnail": "https://randomuser.me/api/portraits/thumb/women/90.jpg"
                    },
                    "nat": "IR"
                },
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
                        "value": ""
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
                "results": 2,
                "page": 1,
                "version": "1.3"
            }
        }
        """
    }
}
