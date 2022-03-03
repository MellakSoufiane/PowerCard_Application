import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddpowercardComponent } from './addpowercard.component';

describe('AddpowercardComponent', () => {
  let component: AddpowercardComponent;
  let fixture: ComponentFixture<AddpowercardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddpowercardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddpowercardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
