import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SiteService {
  domain: String = '/api/v1/sitio';

  constructor(private http: HttpClient) { }

  public verSitios(): Observable<any> {
    return this.http.get(`${this.domain}/verSitios`);
  }
}
