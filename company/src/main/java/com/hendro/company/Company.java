package com.hendro.company;
import jakarta.persistence.Entity; // Mengimpor anotasi Entity dari package jakarta.persistence
import jakarta.persistence.GeneratedValue; // Mengimpor anotasi GeneratedValue dari package jakarta.persistence
import jakarta.persistence.Id; // Mengimpor anotasi Id dari package jakarta.persistence
import lombok.*; // Mengimpor semua anotasi lombok, termasuk Getter, Setter, AllArgsConstructor, NoArgsConstructor, dan Builder

@Entity // Menandakan bahwa kelas ini adalah entitas yang dapat disimpan dalam database
@Getter // Menghasilkan metode getter untuk semua bidang kelas
@Setter // Menghasilkan metode setter untuk semua bidang kelas
@AllArgsConstructor // Menghasilkan konstruktor dengan semua parameter
@NoArgsConstructor // Menghasilkan konstruktor tanpa parameter
@Builder // Menghasilkan metode builder untuk membuat objek instans dari kelas ini
public class Company {

    @Id // Menandakan bahwa properti ini adalah primary key dalam tabel database
    @GeneratedValue // Menandakan bahwa nilai properti ini akan secara otomatis di-generate oleh sistem
    private Integer id; // Properti untuk menyimpan ID perusahaan

    private String name; // Properti untuk menyimpan nama perusahaan
    private String email; // Properti untuk menyimpan email perusahaan
}
