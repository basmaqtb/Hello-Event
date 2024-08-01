import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { JwtService } from 'src/app/Service/jwt.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm!: FormGroup


  constructor(
    private service : JwtService,
    private fb: FormBuilder
  ){}
ngOnInit(): void {
  this.registerForm = this.fb.group({
    name: ['', [Validators.required]],
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required]],
    confirmPassword: ['', [Validators.required]],
    role: ['', Validators.required]
  }, {validator: this.passwordMathValidator})
}


passwordMathValidator(formGroup: FormGroup){
  const password = formGroup.get('password')?.value;
  const confirmPassword= formGroup.get('confirmPassword')?.value;

  if(password != confirmPassword){
    formGroup.get('confirmPassword')?.setErrors({passwordMisamtch : true});
  }else
  {
    formGroup.get('confirmPassword')?.setErrors(null);
  }
}

submitForm() {
  if (this.registerForm.valid) {
    console.log(this.registerForm.value);
    const role = this.registerForm.get('role')?.value;
    if (role === 'ADMIN') {
      this.service.registerAdmin(this.registerForm.value).subscribe(
        (response) => {
          console.log(response);
        }
      );
    } else {
      this.service.register(this.registerForm.value).subscribe(
        (response) => {
          console.log(response);
    
        }
      );
    }
  }
}
  
}
