package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfOneTexts_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneListOfOneTexts: IndexedSeq[String]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfOneTexts_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfOneTexts_3("+ URI +")"

   def copy(oneListOfOneTexts: IndexedSeq[String] = this._oneListOfOneTexts): OneListOfOneTexts_3 = {

  require(oneListOfOneTexts ne null, "Null value was provided for property \"oneListOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTexts)
    new OneListOfOneTexts_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneListOfOneTexts = oneListOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneTexts_3): this.type = {
    this._URI = result._URI
    this._oneListOfOneTexts = result._oneListOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneListOfOneTexts_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneListOfOneTexts")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfOneTexts = {
    _oneListOfOneTexts
  }

  def oneListOfOneTexts_= (value: IndexedSeq[String]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneListOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfOneTexts") oneListOfOneTexts: IndexedSeq[String]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneListOfOneTexts = if (oneListOfOneTexts == null) IndexedSeq.empty else oneListOfOneTexts)

}

object OneListOfOneTexts_3 extends AggregateRootCompanion[OneListOfOneTexts_3]{

  def apply(
    oneListOfOneTexts: IndexedSeq[String] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneListOfOneTexts)
    require(oneListOfOneTexts ne null, "Null value was provided for property \"oneListOfOneTexts\"")
    new OneListOfOneTexts_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneListOfOneTexts = oneListOfOneTexts)
  }

}
