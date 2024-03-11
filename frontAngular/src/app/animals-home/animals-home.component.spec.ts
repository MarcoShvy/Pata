import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalsHomeComponent } from './animals-home.component';

describe('AnimalsHomeComponent', () => {
  let component: AnimalsHomeComponent;
  let fixture: ComponentFixture<AnimalsHomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AnimalsHomeComponent]
    });
    fixture = TestBed.createComponent(AnimalsHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
