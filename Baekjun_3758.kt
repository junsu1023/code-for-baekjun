import java.util.*

fun main()  = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        var st = StringTokenizer(readLine())
        val teamNum = st.nextToken().toInt()
        val problemNum = st.nextToken().toInt()
        val myTeamID = st.nextToken().toInt()
        val log = st.nextToken().toInt()
        val teamPerProblemScore = Array(teamNum + 1) { IntArray(problemNum + 1) }
        val submitCnt = IntArray(teamNum + 1)
        val lastSubmit = IntArray(teamNum + 1)
        val totalScore = IntArray(teamNum + 1)
        repeat(log) {
            st = StringTokenizer(readLine())
            val teamID = st.nextToken().toInt()
            val problem = st.nextToken().toInt()
            val score = st.nextToken().toInt()
            if(teamPerProblemScore[teamID][problem] < score) teamPerProblemScore[teamID][problem] = score
            submitCnt[teamID]++
            lastSubmit[teamID] = it + 1
        }
        for(i in 1 .. teamNum){
            for(j in 1 .. problemNum) {
                totalScore[i] += teamPerProblemScore[i][j]
            }
        }
        var rank = 1
        for(i in 1 .. teamNum) {
            if(i == myTeamID) continue
            if(totalScore[i] > totalScore[myTeamID]) rank++
            if(totalScore[i] == totalScore[myTeamID]) {
                if(submitCnt[i] < submitCnt[myTeamID]) rank++
                if(submitCnt[i] == submitCnt[myTeamID]) {
                    if(lastSubmit[i] < lastSubmit[myTeamID]) rank++
                }
            }
        }
        println(rank)
    }
}