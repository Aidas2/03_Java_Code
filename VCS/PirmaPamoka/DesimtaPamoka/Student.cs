using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DesimtaPamoka
{
    class Student : Person
    {
        private int _numCourses;
        private List<string> _courses;
        private List<int> _grades;

        public Student(string name, string surname, string address) : base(name, surname, address)
        {
        }

        public void AddCourse( string courseName)
        {
            _courses.Add(courseName);
        }

        public void RemoveCourse(string courseName)
        {
            _courses.Remove(courseName);
        }

        public void AddCourseGrade(string courseName, int grade)
        {
            var index = _courses.IndexOf(courseName);
            if (index == -1)
            {
                AddCourse(courseName);
                index = _courses.Count - 1;
            }
            _grades[index] = grade;
        }

        public void PrintGrades()
        {
            for (int i = 0; i < _courses.Count; i++)
            {
                Console.WriteLine($"{_courses[i]}: {_grades[i]}");
            }
        }



        public double GetAverageGrade()
        {
            return _grades.Average();
        }

    }
}
