import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Jwt } from '../Module/Jwt';


const url = ["http://localhost:8085/api/v1/auth/"]
@Injectable({
  providedIn: 'root'
})
export class JwtService {

  constructor(private http: HttpClient) { }

  registerAdmin(singRequest: any): Observable<Jwt> {
    return this.http.post<Jwt>(url + 'registerAdmin', singRequest);
  }
  
  register(singRequest:any): Observable<Jwt>{
    return this.http.post<Jwt>(url+'register', singRequest)
  }

  login(loginRequest:any): Observable<Jwt>{
    return this.http.post<Jwt>(url+'authenticate', loginRequest)
  }
  // Méthode pour obtenir le nombre d'utilisateurs
  getUserCount(): Observable<number> {
    const headers = this.createAuthorizationHeader();
    return this.http.get<number>(url + 'User/count', { headers });
  }

  private createAuthorizationHeader(): HttpHeaders | undefined {
    const jwtToken = localStorage.getItem('jwt');
    if (jwtToken) {
      console.log("JWT token found in local storage", jwtToken);
      return new HttpHeaders().set("Authorization", "Bearer " + jwtToken);
    } else {
      console.log("JWT token not found in local storage");
      return undefined;
    }
  }
}