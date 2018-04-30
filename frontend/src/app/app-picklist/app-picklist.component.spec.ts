import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppPicklistComponent } from './app-picklist.component';

describe('AppPicklistComponent', () => {
  let component: AppPicklistComponent;
  let fixture: ComponentFixture<AppPicklistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppPicklistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppPicklistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
