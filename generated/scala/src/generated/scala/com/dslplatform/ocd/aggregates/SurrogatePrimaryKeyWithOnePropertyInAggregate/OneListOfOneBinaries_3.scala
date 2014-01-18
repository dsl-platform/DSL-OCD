package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneBinaries_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneBinaries_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneBinaries_3("+ URI +")"

   def copy(oneListOfOneBinaries: IndexedSeq[Array[Byte]] = this._oneListOfOneBinaries): OneListOfOneBinaries_3 = {

  require(oneListOfOneBinaries ne null, "Null value was provided for property \"oneListOfOneBinaries\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneBinaries)
    new OneListOfOneBinaries_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneBinaries = oneListOfOneBinaries)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneBinaries_3): this.type = {
    this._URI = result._URI
    this._oneListOfOneBinaries = result._oneListOfOneBinaries
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneBinaries_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneBinaries = {
    _oneListOfOneBinaries
  }

  def oneListOfOneBinaries_= (value: IndexedSeq[Array[Byte]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneBinaries") oneListOfOneBinaries: IndexedSeq[Array[Byte]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneBinaries = if (oneListOfOneBinaries == null) IndexedSeq.empty else oneListOfOneBinaries)

}

object OneListOfOneBinaries_3 extends AggregateRootCompanion[OneListOfOneBinaries_3]{

  def apply(
    oneListOfOneBinaries: IndexedSeq[Array[Byte]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneBinaries)
    require(oneListOfOneBinaries ne null, "Null value was provided for property \"oneListOfOneBinaries\"")
    new OneListOfOneBinaries_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneBinaries = oneListOfOneBinaries)
  }

}
