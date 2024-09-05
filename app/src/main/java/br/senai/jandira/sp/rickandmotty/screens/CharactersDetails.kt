package br.senai.jandira.sp.rickandmotty.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.jandira.sp.rickandmotty.model.Character
import coil.compose.AsyncImage

@Composable
fun CharacterDetails(modifier: Modifier = Modifier) {

    var episode by remember {
        mutableStateOf(Character())
    }

    var character by remember {
        mutableStateOf(Character())
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(200.dp),
                shape = RoundedCornerShape(100.dp)
            ) {
                AsyncImage(
                    model = character.image,
                    contentDescription = "",
                    modifier = Modifier.size(200.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = Modifier
                        .height(20.dp)
                        .width(100.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "${character.name}"
                    )
                }

                Card(
                    modifier = Modifier
                        .height(20.dp)
                        .width(100.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "${character.species}"
                    )
                }

                Card(
                    modifier = Modifier
                        .height(20.dp)
                        .width(100.dp),
                ) {
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "${character.gender}"
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
                Card (
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp)

                ){
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "${episode.episode}"
                    )
                }
            }

        }


    }




@Preview
@Composable
private fun CharacterDetailsPreview() {
    CharacterDetails()

}

//Card (
//modifier = Modifier
//.height(20.dp)
//.width(70.dp)
//) {
//    Text(text = "Nome: ${character.name}")
////                Text(text = "Status: ${character.status}")
////                Text(text = "Especie: ${character.species}")
////                Text(text = "Tipo: ${character.type}")
////                Text(text = "Genero: ${character.gender}")
////                Text(text = "Origem: ${character.origin.name}")
//}

//OutlinedTextField(
//                value = id,
//                onValueChange = { id = it },
//                modifier = Modifier
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(16.dp),
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//                trailingIcon = {
//                    IconButton(onClick = {
//
//                        val callCharacter = RetrofitFactory()
//                            .getCharacterService()
//                            .getCharacterById(id.toInt())
//
//                        callCharacter.enqueue(object : Callback<Character> {
//                            override fun onResponse(p0: Call<Character>, response: Response<Character>) {
//                                character = response.body()!!
//                            }
//
//                            override fun onFailure(p0: Call<Character>, p1: Throwable) {
//
//                            }
//
//                        })
//
//                    }) {
//                        Icon(
//                            imageVector = Icons.Default.Search,
//                            contentDescription = "")
//
//                    }
//                })