## intent:affirm
- tak
- owszem
- jasne

## intent:deny
- nie
- raczej nie

## intent:goodbye
- pa
- proszę znaleźć mój telefon

## intent:greet
- hej
- cześć

## intent:lost_description
- [Zostawiłem go na ławce przy sklepie Carrefour](description).
- [Zgubiłem go pod ławką w parku](description)
- [Został na przystanku autobusowym](description)
- [Zgubiłem go na ławeczce w lesie](description)
- [Zostawiłem go na ławce po prawej stronie od wejścia do parku](description:zostawiłem go na ławce po prawej stronie od wejścia do parku).
- [Jest czerwony i ma zbitą szybkę. Na tapecie jestem ja z moim najlepszym kumplem](description)
- [Moj telefon jest czerwony i ma zbitą przednią szybkę](description).
- [Jest czerwony i ma zbitą szybkę](description:jest czerwony i ma zbitą szybkę)
- [był czerwony i miał zbitą szybkę](description)
- [Miał zbitą szybkę i był carny](description:miał zbitą szybkę i był carny)

## intent:lost_info
- Zgubiłem [koszulkę](thing:koszulka)
- Zostawiłem [torbę](thing:torba) na przystanku
- Zapomniałem [telefonu](thing:telefon) w tramwaju
- zgubiłem [telefon](thing)
- zgubiłem [telefon](thing)
- zgubiłem [torebkę](thing)
- zgubiłem [torbę](thing:torba)
- zgubiłem [telefon](thing)

## intent:lost_phone
- Mój numer to [324234123](phone)
- [506540031](phone)
- [504531918](phone)
- [504531918](phone)
- [504531213](phone)
- [504234890](phone)
- [430212213](phone)
- Mój telefon to [312333123](phone)

## intent:lost_place
- Przy [ulicy Gocławskiej 304](address:ulica Gocławska 304)
- W [parku Bródnowskim](address:park Bródnowski)
- [al. prymasa tysiąclecia 31](address)
- [W tramwaju 31](address:tramwaj 31)
- W parku przy [ulicy Szczęśliwickiej 31](address:ulica szczęśliwicka 31)
- w [parku bródnowskim](address:park bródnowski)
- W [parku bródnowskim](address:park bródnowski)
- na ulicy [polnej 3](address)
- na [dworcu centralnym](thing:dworzec centralny)
- na ulicy [Marynarskiej 12](address:Marynarska 12)

## intent:lost_time
- To było [wczoraj](day) o [13](hour)
- Przed 15 minutami
- [Dzisiaj](day:dzisiaj) około godziny [16](hour)
- [dzisij ](day:dzisiaj)około [17](hour)
- [Wczoraj](day:wczoraj) o [15](hour)
- [dzisiaj](day) o [18](hour)
- [dzisiaj](day) o [19](hour)

## intent:q_rurobot
- Czy jesteś robotem?
- Z kim rozmawiam?
- Czy jesteś człowiekiem?

## synonym:dworzec centralny
- dworcu centralnym

## synonym:dzisiaj
- Dzisiaj
- dzisij
- dzisij

## synonym:jest czerwony i ma zbitą szybkę
- Jest czerwony i ma zbitą szybkę

## synonym:koszulka
- koszulkę

## synonym:park Bródnowski
- parku Bródnowskim

## synonym:park bródnowski
- parku bródnowskim

## synonym:telefon
- telefonu

## synonym:torba
- torbę

## synonym:tramwaj 31
- W tramwaju 31

## synonym:ulica Gocławska 304
- ulicy Gocławskiej 304

## synonym:ulica szczęśliwicka 31
- ulicy Szczęśliwickiej 31

## synonym:wczoraj
- Wczoraj

## synonym:zostawiłem go na ławce po prawej stronie od wejścia do parku
- Zostawiłem go na ławce po prawej stronie od wejścia do parku

## regex: lost_phone
- [0-9]{9}
