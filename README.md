Study Case: Sistem Penghitung Gaji Karyawan
Kita memiliki sistem penghitung gaji yang awalnya hanya menghitung gaji tetap (Fixed Salary) untuk karyawan tetap. Seiring berjalannya waktu, sistem perlu mendukung jenis gaji lain, seperti gaji per jam (Hourly S`alary).

Poblem: 
Setiap kali kita menambahkan jenis gaji baru, seperti gaji per jam (Hourly Salary), kita harus memodifikasi metode calculateSalary() dalam SalaryCalculator. Ini melanggar prinsip OCP karena metode ini selalu terbuka untuk modifikasi.

Refactoring to Better Design:
Untuk menerapkan prinsip OCP, interface `SalaryStrategy` digunakan untuk mendefinisikan metode `calculateSalary()`. Setiap jenis gaji diimplementasikan sebagai kelas terpisah yang mengimplementasikan interface ini, sehingga memungkinkan penambahan jenis gaji baru tanpa harus mengubah kelas `SalaryCalculator`. Dengan adanya interface `SalaryStrategy`, logika perhitungan gaji terpisah ke dalam kelas-kelas yang mengimplementasikan interface tersebut, seperti `FixedSalaryStrategy` dan `HourlySalaryStrategy`. Dengan demikian, `SalaryCalculator` hanya menggunakan strategi yang diberikan untuk menghitung gaji.
