import { Component } from '@angular/core';
import { Utilisateur } from 'src/app/Module/Utilisateur';
import { JwtService } from 'src/app/Service/jwt.service';

@Component({
  selector: 'app-all-user',
  templateUrl: './all-user.component.html',
  styleUrls: ['./all-user.component.css']
})
export class AllUserComponent {

  users!: Utilisateur[] ;

  constructor(
    private service: JwtService
  ){}

  ngOnInit(): void {
    this.loadUsers();
  }

  private loadUsers(): void {
    this.service.getAllUsers().subscribe(
      (users: Utilisateur[]) => {
        this.users = users;
      },
      (error) => {
        console.error('Error fetching users', error);
      }
    );
  }

  deleteUser(id_user: number): void {
    this.service.deleteUser(id_user).subscribe(
      () => {
        this.users = this.users.filter(user => user.id_user !== id_user);
        console.log('User deleted successfully');
      },
      (error) => {
        console.error('Error deleting user', error);
      }
    );
  }
}
