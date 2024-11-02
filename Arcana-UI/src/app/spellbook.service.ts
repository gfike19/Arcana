import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpellbookService {

  private apiUrl = 'http://localhost:4200/api/spellbook'; // URL of your Spring Boot endpoint

  constructor(private http: HttpClient) { }

  getSpellbook(): Observable<string> {
    return this.http.get(this.apiUrl, { responseType: 'text' });
  }
}
