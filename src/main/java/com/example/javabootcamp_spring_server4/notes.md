# Spring

Wird verwendet um lokal Server zu hosten.


Wichtige Syntax:

### Get

Anfrage nach Daten.

``` java
@GetMapping("url-pfad")
public String returnValue(){
    return value;
}
```


### Put

Updaten von Daten

``` java
@PutMapping("url-pfad/{variable}")
    public ApiCharacter updateCharacter(@PathVariable datentyp variable, @RequestBody Datentyp andereVariable) {
        return objekt.methodeName(variable, variable);
    }
```

methode  die updatet in anderer Class...

### Post

Upload von  Daten

``` java
 @PostMapping("url-pfad")
    public Datentyp name (@RequestBody Datentyp variable) {
        return Objekt.methodeName(variable);
    }
``` 
methode  die uploaded in anderer Class...

### Delete

Löschen von Daten

``` java
@DeleteMapping("url-pfad/{variable}")
    public void deleteCharacter(@PathVariable Datentyp variable) {
        Objekt.methodeName(variable);
    }
```

methode  die deletet in anderer Class...

