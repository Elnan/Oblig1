# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Olav Elnan, S236370, s236370@oslomet.no
* ...

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Olav har hatt hovedansvar for alt.

# Oppgavebeskrivelse

I Oppgave 1 så måtte jeg først finne en måte å bytte plass først.
For det trengte jeg en hjelpevariabel, "temp".
Derreter var det bare å loope igjennom arrayet, sammenligne to tall
og bytte plass på de om det neste tallet var større enn det
nårværende tallet. På den måten ender det største tallet sist.
---

I Oppgave "1b", dvs ombyttinger, var det bare å legge til en hjelpevariabel
som telte oppover hver gang en ombytting ble gjort og returnere den til slutt.
---

I Oppgave 2 så brukte jeg bare en vanlig for-løkke for å loope
igjennom arrayen. Siden tabellen var det bare å sjekke det nåværende tallet
var anerledes enn det neste. Isåfall legges det til i telleren
og nåværende tall oppdateres.
---

I Oppgave 3 var tabbelen usortert, så da måtte jeg bruke en ekstra for-loop
for å ha kontroll på hvilke tall som lagt til fra før.
Tall som var lagt til fra før blir hoppet over, men
nye tall blir lagt till i telleren.
---

I Oppgave 4 så slet jeg litt med å finne en måte å få det til å fungere på,
men når jeg brukte "while" istedenfor "for", så funket det.
Sorterer først oddetall ved hjelp av modulo og noterer plasseringen
hvor oddetall og partall møtes. Sorterer deretter tallene hver for seg.

---

I Oppgave 5 så brukte jeg en hjelpevariabel til å lagre hvilken char som
står i siste posisjon. Deretter bruker jeg en for-løkke til å loope
gjennom og flytte tallene ett hakk bortover.
Legger så det tidligere lagrede elementet til siste posisjon.
---

I Oppgave 7a så brukte jeg en char-array til å legge inn bokstavene i riktig
rekkefølge. Gjør dette ved å gå gjennom orden annenhver og legge til en og en
bokstav, så lenge det er bokstaver igjen.

---
I Oppgave 7b så lagres string input i en array og loopes gjennom.
Legger til første tegn i hvert ord i første plass i svar-array.
Derretter andre tegn i andre plass, osv. 
Metoden har en begrensning på 30 tegn per streng i argumentet.
Finnes muligens bedre måter å løse dette på, men denne løsningen er effektiv når det 
kommer til antall opperasjoner. 
